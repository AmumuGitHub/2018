import Vue from 'vue'
import App from './App.vue'

//全局导入   03
import './assets/css/index.css'
//引入安装注册axios
import axios from 'axios'
import qs from 'qs'
Vue.prototype.$axios = axios
Vue.prototype.$qs = qs

new Vue({
  el: '#app',
  data:{
    sendformShow:false
  },
  render: h => h(App)
})
