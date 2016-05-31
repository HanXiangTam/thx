package zhou
import scala.collection.mutable.ArrayBuffer
object lesson3 {

  def isort(xs : List[Int]): List[Int]={
    if(xs.isEmpty)Nil;
    else insert(xs.head,isort(xs.tail));
  }
  
  def insert(x : Int,xs : List[Int]): List[Int]={
    if(xs.isEmpty || x <= xs.head){
       x :: xs;
    }else{
      xs.head :: insert(x, xs.tail);
    }
  }
  
  def main(args: Array[String]): Unit = {
     //定义一个长度为10的数值数组
     val numberArray =new Array[Int](10);
     //定义一个长度为10的String类型数组
     val stringArray =new Array[String](10);
     //需要注意的是，val strArray=new Array[String](10)
     //这意味着strArray不能被改变，但数组内容是可以改变的
     stringArray(0)="First Element";
     println(stringArray);
     //另一种定长数组定义方式
     //这种调用方式其实是调用其apply方法进行数组创建操作
     val stringArray2 = Array("First","Second");
     println(stringArray2);
     
     val strArrayVar=ArrayBuffer[String]();
     //+=意思是在尾部添加元素
     strArrayVar+="Hello";
     strArrayVar+=("World","Programmer")
     println(strArrayVar);
     println(strArrayVar.length);
     
     //追加Array数组
     strArrayVar++=Array("Wllcome","To","XueTuWuYou");
     println(strArrayVar);
     
     //追加list
     strArrayVar++=List("Wllcome","To","XueTuWuYou");
     println(strArrayVar);
      
     //删除尾部3个元素
     strArrayVar.trimEnd(3);
     println(strArrayVar);
     
     //创建整型数组缓冲
     var intArrayVar =ArrayBuffer(1,2,3);
     println(intArrayVar);
     
     //在数组索引为0的位置插入元素6
     intArrayVar.insert(0, 6);
     println(intArrayVar);
     
     //在数组索引为0的位置插入元素7,8,9
     intArrayVar.insert(0,7,8,9);
     println(intArrayVar);
     
     //从索引0开始，删除4个元素s
     intArrayVar.remove(0,4);
     println(intArrayVar);
     //转成定长数组
     println(intArrayVar.toArray);
     //将定长数组转成ArrayBuffer
      println(intArrayVar.toBuffer);

     //数组遍历
     //to
     for(i <- 0 to intArrayVar.length-1) println("Array Element:"+intArrayVar(i));
     //until
     for(i <- 0 until intArrayVar.length) println("Array Element:"+intArrayVar(i));
     //数组方式（推荐使用）
     for(i <- intArrayVar) println("Array Element:"+i);
     //步长为2
     for(i <- 0 until (intArrayVar.length,2)) println("Array Element: "+intArrayVar(i));
     //倒序输出
     println((0 until intArrayVar.length).reverse);
     for(i <- (0 until intArrayVar.length).reverse) println("Array Element:"+intArrayVar(i));
     
     //数组转换
     //生成新的数组，原数组不变
     //缓冲数据转换后产生的仍然是缓冲数组
     var intArrayVar2=for(i <- intArrayVar) yield i*2;
     println(intArrayVar2);
     //定长数组转转后产生的仍然是定长数组，原数组不变
     var intArrayNoBuffer=Array(1,2,3);
     var intArrayNoBuffer2=for(i <- intArrayNoBuffer) yield i*2;
     //加入过滤条件
     intArrayNoBuffer2=for(i <- intArrayNoBuffer if i>=2) yield i*2;
     println(intArrayNoBuffer2.toBuffer);
     
     //数组操作中的常用算法
     val intArr=Array(1,2,3,4,5,6,7,8,9,10);
     //val intArr=Array(1 to 10);
     println(intArr.sum);
     println(intArr.max);
     println(intArr.min);
     //mkString()方法
     println(intArr.mkString(","));
     println(intArr.mkString("<",",",">"));
     
     //多维数组
     var multiDimArr = Array(Array(1,2,3),Array(2,3,4));
     println(multiDimArr(0)(2));
     for(i <- multiDimArr)println(i.mkString(","));
     
     //列表List
     //字符串类型List
     var fruit=List("Apple","Banana","Orange");
     println(fruit);
     //前一个语句与下面语句等同
     var fruit2=List.apply("Apple","Banana","Orange");
     println(fruit2);
     //数值类型List
     var nums=List(1,2,3,4,5);
     for (i <- nums) println("List Element: "+i)
     println(nums);
     //多重List，List的子元素为List
     var diagMatrix = List(List(1,0,0),List(0,1,0),List(0,0,1));
     
     var listStr:List[Object]=List("This","Is","Corvariant","Example");
     //var listStr=List();
     println(listStr);
     
     //常用构造方法
     val nums2 = 1::(2::(3::(4::Nil)));
     //val nums=1::2::3::4::Nil;
     //list常用操作
     //判断是否为空
     println(nums2.isEmpty);
     //取第一个无素
     println(nums2.head);
     //取除第一个元素外剩余的元素，返回的是列表
     println(nums2.tail);
     //取列表第二个元素
     println(nums2.tail.head);
     //List连接操作
     println(List(1,2,3):::List(4,5,6));
     //取除最后一个元素外的元素，返回的是列表
     println(nums2.init);
     //列表元素倒置
     println(nums2.reverse);
     //一些好玩的方法调用
     println(nums2.reverse.reverse==nums2);
     println(nums2.reverse.init);
     println(nums2.tail.reverse);
     //丢弃前n个元素sss
     println(nums2 drop 3);
     //获取前n个元素
     println(nums2 take 3);
     //将列表进行分割
     println(nums2.splitAt(2));
     //按照下标取其中一个元素
     println(nums2(2));
     println(nums2.take(2),nums2.drop(2));
     //Zip操作
     val nums3=List(1,2,3,4);
     val chars=List('1','2','3','4');
     var zip1 = nums zip chars;
     println( nums zip chars);
     println(nums3.toString);
     println(nums3.mkString);
     print(nums3.toArray);
     
     //List伴生对象方法
     //apply方法
     List.apply(1,2,3);
     //range方法，构建某一值范围内的List
     List.range(2, 6);
     //步长为2
     List.range(2, 6,2);
     //步长为-1
     List.range(2, 6,-1);
     List.range(6,2 ,-1);
     //构建相同元素
     List.fill(5)("hey");
     //unzip方法
     val (list1,list2) = zip1.unzip;
     println(zip1.unzip);
     //list.flatten，将列表平滑成第一个无素
     val xss = List(List('a','b'),List('c'),List('d','e')) ;
     println(xss);
     println(xss.flatten);
     //列表连接
     println( List.concat(List('a', 'b'), List('c')));
  }

}