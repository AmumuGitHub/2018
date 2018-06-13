//引入，安装，注册 状态管理
import Vue from 'vue'
import Vuex from 'vuex';
Vue.use(Vuex);

import actions from './actions'
import mutations from './mutations'
import getters from './getters'
import state from './state'


//Vuex.Store({配置}); 返回一个状态管理对象
export default new Vuex.Store({
  actions,mutations,getters,state
});
