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
    sendformShow:false,
    list : [{
      "id"  : 1,
      "time" : "1523959828050",
      "userName" : "刘诗诗",
        "content":"<img src='./dist/baobao.gif'/>等夏天等冬天，等下个季节"
     },
    
     {
      "id"  : 2,
      "time" : "1523971433146",
      "userName" : "陈粒",
        "content":"<img src='./dist/haixiu.gif'/>不敢回望，左顾右盼不自然的暗自喜欢"
     }
    ]
    
  },
  render: h => h(App)
})
