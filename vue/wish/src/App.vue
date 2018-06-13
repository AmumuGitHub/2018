<template>
    <div id="app">
        <topDiv></topDiv>
        <mainDiv></mainDiv>
        <sendformDiv v-show="this.$root.$data.sendformShow"></sendformDiv>
   </div>
</template>

<script>
import topDiv from "./components/topDiv";
import mainDiv from "./components/mainDiv";
import sendformDiv from "./components/sendformDiv";
export default {
  name: 'app',
  components: {
    topDiv,
    mainDiv,
    sendformDiv
  }
}
</script>