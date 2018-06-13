import Vue from 'vue'
import App from './App.vue'// import 变量 from '...'  01 // import {属性} from '...' 02

new Vue({
  el: '#app',
  render: h => h(App)
})

// this == {}