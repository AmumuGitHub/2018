<template>
  <div class="detail">
    <h3>我是detail组件</h3>
    params:{{this.$route.params}}<br>
    query:{{this.$route.query}}<br>
  </div>
</template>
<script>
export default {
  mounted(){
    console.log(this.$route.params);
    console.log(this.$route.query);
    console.log(this.$route.path);
  }
}
</script>

