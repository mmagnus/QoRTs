package internalTests

import net.sf.samtools._


object testing {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val t = CigarOperator.INSERTION                 //> t  : net.sf.samtools.CigarOperator = I
  val t2 = CigarOperator.SOFT_CLIP.consumesReadBases()
                                                  //> t2  : Boolean = true
  val t3 = CigarOperator.SOFT_CLIP.consumesReferenceBases()
                                                  //> t3  : Boolean = false

  val t4 = Range(0,10)                            //> t4  : scala.collection.immutable.Range = Range(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
                                                  //| 

  val i1 = Iterator[Int](1,2,3)                   //> i1  : Iterator[Int] = non-empty iterator

  val i11 = i1.next                               //> i11  : Int = 1


  class TestClass() {
    val myArray = Array[Int](0,1,2,3,4,5);
    def apply(i : Int) : Int = {
      return myArray(i);
    }
    def update(i : Int, j : Int){
      myArray(i) = j;
    }
  }
  
  val tc = new TestClass();                       //> tc  : internalTests.testing.TestClass = internalTests.testing$$anonfun$main$
                                                  //| 1$TestClass$1@422f3d17
  
  val tct1 = tc(1);                               //> tct1  : Int = 1
val tct3 = tc(2);                                 //> tct3  : Int = 2
  tc(2) += 1;
  
val tct2 = tc(2);                                 //> tct2  : Int = 3

 val str = "%1.3f".format(115.0)                  //> str  : String = 115.000
 
 val tttsts = Seq('A'.toInt ,'B'.toInt, 'C'.toInt,'G'.toInt,'N'.toInt,'S'.toInt,'H'.toInt).max
                                                  //> tttsts  : Int = 83
 
  val x1 = 200;                                   //> x1  : Int = 200
  val x1s = 200.toHexString;                      //> x1s  : String = c8
  val s1x = Integer.parseInt("c8",16)             //> s1x  : Int = 200
  val srsg = "sample.ID	size.factorx".substring(0,21);
                                                  //> srsg  : String = sample.ID	size.factor
                                                  
                                                  
  val r1b = Vector((386666,386766));              //> r1b  : scala.collection.immutable.Vector[(Int, Int)] = Vector((386666,38676
                                                  //| 6))
  val r2b = Vector((386793,386893));              //> r2b  : scala.collection.immutable.Vector[(Int, Int)] = Vector((386793,38689
                                                  //| 3))
  
  val merged = (r1b ++ r2b).sorted                //> merged  : scala.collection.immutable.Vector[(Int, Int)] = Vector((386666,38
                                                  //| 6766), (386793,386893))
  
  merged.tail                                     //> res0: scala.collection.immutable.Vector[(Int, Int)] = Vector((386793,386893
                                                  //| ))
  merged.head                                     //> res1: (Int, Int) = (386666,386766)
  
  
  
  merged.tail.foldLeft(Vector(merged.head))( (soFar,curr) =>{
      if(curr._1 <= soFar.last._2){
        print("soFar = " + soFar+"\n");
        print("curr = " + curr+"\n");
        print("soFar.last._2 = " + soFar.last._2+"\n");
        print("curr._1 = " + curr._1+"\n");
        soFar.updated(soFar.length - 1, (soFar.last._1, math.max(curr._2, soFar.last._2)));
      } else {
        soFar :+ curr;
      }
    })                                            //> res2: scala.collection.immutable.Vector[(Int, Int)] = Vector((386666,386766
                                                  //| ), (386793,386893))
    
    
}