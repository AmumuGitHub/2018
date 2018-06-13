<template>
  <div id="app">
    <loading></loading>
    <h1>{{ msg }}</h1>
    <router-link to="/home" active-class="active">首页</router-link>
    <router-link to="/news" active-class="active">新闻</router-link>
    <router-link to="/user" active-class="active">用户</router-link>
    <router-link to="/login" active-class="active">登录</router-link>
    <router-link to="/reg" active-class="active">注册</router-link>
    <transition
      enter-active-class="animated fadeIn"
    >
      <router-view></router-view>
    </transition>
    <!-- <div class="box animated fadeIn infinite">box</div> -->
  </div>
</template>

<script>
export default {
  name: 'app',
  data () {
    return {
      msg: 'vue-cli + vue-router'
    }
  }
};

</script>

<style>
.active{
  background: #399;
}
.box{background:red;width:100px;height:100px;}
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
