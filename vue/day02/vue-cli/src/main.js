//main.js  输入插件， 安装插件，挂载(注册)插件
import Vue from 'vue'
import App from './App.vue'


//路由
import VueRouter from 'vue-router';
Vue.use(VueRouter);//安装 ,子组件可以使用vue-router 内容的组件 router-link   Vue.component('router-link',router-link)
import routes from './router.config'
//创建路由对象
let router = new VueRouter(routes)

//输入animate.css

import  'animate.css';  //全局 


//定义插件
import loading from './components/loading'
Vue.use(loading);

// xxx.abc   ==  使用animate.css 里面的.abc{}

new Vue({
  el: '#app',
  render: h => h(App),
  router//挂载  为了子组件的this可以通过$router
})
