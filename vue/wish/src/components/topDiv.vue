<template>
  <div id="top">
    <span id="send" @click="iwish()"></span>
  </div>
</template>

<script>
  export default {
    methods:{
      iwish(){
          this.$root.$data.sendformShow=true;
      }
    }
  }
</script>
