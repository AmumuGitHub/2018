import home from './components/home.vue'
import news from './components/news.vue'
import detail from './components/detail.vue'
import user from './components/user.vue'
import reg from './components/reg.vue'
import login from './components/login.vue'

//路由配置
let routes = [
  {path:'/home',component:home},
  {
    path:'/news',
    component:news,
    children:[
      {name:'detail',path:'detail/:aid',component:detail}
    ]
  },
  {path:'/user',component:user},
  {path:'/login',component:login},
  {path:'/reg',component:reg},
  {path:'/',redirect:'/home'},
  {path:'*',redirect:'/home'}
];
// export default routes;
export default {
  routes
}