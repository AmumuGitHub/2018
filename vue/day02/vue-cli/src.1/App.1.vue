<template>
  <div id="app">
    <h1>{{ msg }}</h1>
    
  </div>
</template>

<script>


// export const str='qq';//输出属性，不含"接口" 02
// export default {}|App   // 输出对象,含接口 //01

// export default App;

export default {
  name: 'app',
  data () {
    return {
      msg: 'vue-cli'
    }
  }
};


</script>

<style>
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
