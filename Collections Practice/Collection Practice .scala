// Databricks notebook source
// import scala.collection.mutable.arraArrayBuffer
import scala.collection.mutable
import scala.collection.immutable

val x = ArrayBuffer(2, 4, 6, 8)


// COMMAND ----------

x += 10

// println(x.map(_+1))

// COMMAND ----------

println(x.map(_+1))

// COMMAND ----------

x = x.map(_+1)

//  we cant becasue of val


// COMMAND ----------

// import scala.collection.mutable.arraArrayBuffer
// import scala.collection.mutable.ArrayBuffer

var y = ArrayBuffer(2, 4, 6, 8)

y = y.map(_+1)
y

// COMMAND ----------



// COMMAND ----------

val abc = List(2, 4, 6, 8)

// abc += 10

// COMMAND ----------

var abc = List(2, 4, 6, 8)

abc = abc.map(_+1)
// var xyz = abc :+ 10

abc = abc :+ 10

println(abc)

// COMMAND ----------



// COMMAND ----------



// COMMAND ----------



// COMMAND ----------



// COMMAND ----------


