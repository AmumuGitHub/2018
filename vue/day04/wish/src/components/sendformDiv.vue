<template>
    <div id="send-form">
        <p class="title"><span>许下你的愿望</span><a href="javascript:;" id="close" @click="close()"></a></p>
        <form action="" name="wish">
            <p>
                <label for="username">昵称：</label>
                <input type="text" name="username" v-model="formData.userName" id="username"/>
                <span style="color:red">{{formData.promptUserName}}</span>
            </p>
            <label for="content" style="padding-left:10px;">愿望：(您还可以输入&nbsp;<span id="font-num">50</span>&nbsp;个字)</label>
            <div class="textarea" style="margin: 10px;" contenteditable="true" ref="content" ></div>
            <span style="color:red">{{formData.promptContent}}</span>
             <span id="phiz">
                    <img src="../assets/images/phiz/zhuakuang.gif" alt="抓狂" @click="addImg('zhuakuang.gif')"/>
                    <img src="../assets/images/phiz/baobao.gif" alt="抱抱" @click="addImg('baobao.gif')"/>
                    <img src="../assets/images/phiz/haixiu.gif" alt="害羞" @click="addImg('haixiu.gif')"/>
                    <img src="../assets/images/phiz/ku.gif" alt="酷" @click="addImg('ku.gif')"/>
                    <img src="../assets/images/phiz/xixi.gif" alt="嘻嘻" @click="addImg('xixi.gif')"/>
                    <img src="../assets/images/phiz/taikaixin.gif" alt="太开心" @click="addImg('taikaixin.gif')"/>
                    <img src="../assets/images/phiz/touxiao.gif" alt="偷笑" @click="addImg('touxiao.gif')"/>
                    <img src="../assets/images/phiz/qian.gif" alt="钱" @click="addImg('qian.gif')" />
                    <img src="../assets/images/phiz/huaxin.gif" alt="花心" @click="addImg('huaxin.gif')"/>
                    <img src="../assets/images/phiz/jiyan.gif" alt="挤眼" @click="addImg('jiyan.gif')" />
                </span>
            <span id="send-btn" @click="wishAdd()"></span>
        </form>
    </div>
</template>

<script>
export default {
  data() {
    return {
      formData: {
        act: "wishAdd",
        userName: "",
        content: "",
        promptUserName: "",
        promptContent: ""
      }
    };
  },

  methods: {
    close() {
      this.$root.$data.sendformShow = false;
    },

    wishAdd() {
      this.formData.promptUserName = "";
      this.formData.promptContent = "";
      this.formData.content=this.$refs.content.innerHTML;
      if (this.formData.userName == "") {
        this.formData.promptUserName = "请填写用户名";
        return false;
      }
      if (this.formData.content == "") {
        this.formData.promptContent = "请填写你的愿望";
        return false;
      }

      this.$axios({
        method: "post",
        url: "/weibo/wishAdd.php",
        data: this.$qs.stringify(this.formData)
      }).then(res => {
        this.$parent.$children[1].wishList();
        this.$root.$data.sendformShow = false;
      });
    },

    addImg(add){
     var imgSrc="<img src=/dist/"+add+">";
     this.$refs.content.innerHTML+=imgSrc;
    }
  }
};
</script>
