import Vue from 'vue'
import App from './App.vue'

//全局导入   03
import './assets/css/base.css'
import './assets/js/font'

//引入安装注册路由
import VueRouter from 'vue-router';
Vue.use(VueRouter);
import routes from './router.config';
const router=new VueRouter(routes)



//引入安装注册过滤器
import filters from './filters'
// console.log(filters);

/* for(var key in filters){
  Vue.filter(key,filters[key])
} */

Object.keys(filters).map(key=>Vue.filter(key,filters[key]));

//引入状态管理
import store from './store/index';

//引入安装注册axios
import axios from 'axios';

//拦截器配置
axios.interceptors.request.use(function (config) {
  store.dispatch('showLoading');
  return config;
}, function (error) {
  return Promise.reject(error);
});

axios.interceptors.response.use(function (response) {
  store.dispatch('hideLoading');
  return response;
}, function (error) {
  store.dispatch('hideLoading');
  return Promise.reject(error);
});

Vue.prototype.$http=axios;// http

//定义loading插件
import loading from './loading'
Vue.use(loading);


//引入动画
import 'animate.css';

new Vue({
  el: '#app',
  data:{
    bNav:true,
    bFoot:false
  },
  render: h => h(App),
  router,
  store
  // axios  axios
})
