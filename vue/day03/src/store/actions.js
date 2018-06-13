import * as types from './types';
const actions = {
  showNav:({commit,state})=>{
    commit(types.SHOW_NAV);// -> mutattions
  },
  hideNav:({commit,state})=>{
    commit(types.HIDE_NAV);
  },
  showFoot:({commit,state})=>{
    commit(types.SHOW_FOOT)
  },
  hideFoot:({commit,state})=>{
    commit(types.HIDE_FOOT)
  },
  showLoading:({commit,state})=>{
    commit(types.SHOW_LOADING)
  },
  hideLoading:({commit,state})=>{
    commit(types.HIDE_LOADING)
  }
};

export default actions;