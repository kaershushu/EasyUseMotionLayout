# EasyUseMotionLayout
快速入门MotionLayout动画



## MotionLayout是什么

简而言之，MotionLayout首先是一个布局（继承自ConstraintLayout），可以定位元素。其次，通过动画的方式来表现View组件之间的动态关系。



## MotionLayout有什么特点

1.MotionLayout的动画是完全声明式的，你完全可以通过xml文件的形式来定义复杂动画。假如你需要在通过Java代码定制动画的话，建议你还是用Property Animation吧。

2.兼容Android SDK最低版本是14（`IceCreateSandwich`）



## MotionLayout怎么导入

当前MotionLayout还是Alpha版本，不太稳定，可能会有命名和API的修改。

```
dependencies {
    implementation 'com.android.support.constraint:constraint-layout:2.0.0-alpha2'
}
```



## MotionLayout你需要知道的概念

* ConstaintSet

  > Constraint是`约束`的意思，可以简单理解成一个被`ConstraintLayout`包含的独立的View，实际上Constrait代表的是一个View的约束状态。那么ConstaintSet自然就是一组View的集合了。在MotionLayout的概念里其实就是动画执行`起点`和`终点`的一组View的状态。

* MotionScene，`MotionLayout可以产生动画效果的核心，我们所有的动画效果都是在这个文件里定义。`

  * StateSet
  * ConstraintSet
  * Transition


## 怎样建立一个我们需要的MotionLayout

1.`res`下新建一个`xml`文件夹，用于存放我们需要定义的动画文件。

2.在xml文件夹下新建一个xml文件，`Root Tag`为`MotionScene`。

3.Done！就是这么简单。













