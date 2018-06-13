module.exports = {
  entry:'./src/main.js',//入口
  output:{//出口
    filename:'./dist/bundle.js'
  },
  module:{
    rules:[//规则
      {test:/\.css$/,use:['style-loader','css-loader']},//loader配置
      {
        test:/\.js$/,
        exclude:/node_modules/,//排除
        use:[
          {
            loader:'babel-loader',
            options:{
              presets:['env']
            }
          }
        ]
      }
    ]
  },
  devtool:'source-map', //开启源代码调试模式
  devServer:{//配置webpack服务器
    port:8088,
    open:true
  }
}