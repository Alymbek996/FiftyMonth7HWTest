package com.geektech.fiftymonth7hwtest44

class Math {
    fun add(a:String, b:String):String{
        var result=""
        if(a.contains(".")|| b.contains(".")) {
            result="У вас лишняя точка"
        } else if (a.contains("f")||b.contains("f")){
            val num1=a.toFloat()
            val num2=b.toFloat()
            result=(num1+num2).toString()
        }else if(isNumeric(a)||isNumeric(b)){
            result="Вы ввели буквы"
        }else if(a.isEmpty()||b.isEmpty()){
            result = "Вы ввели ничего"
        }
        else if(a.contains("-")||b.contains("-")){
            result = AddtoInt(a, b, result)
        }
        else{
            result=AddtoInt(a, b, result)
        }
        return result
    }

    private fun AddtoInt(a: String, b: String, result: String): String {
        var result1 = result
        val num1 = a.toInt()
        val num2 = b.toInt()
        result1 = (num1 + num2).toString()
        return result1
    }

    fun divide(a: String, b: String): String {
        var result:String
        if (a == "0") {
            result = "На ноль делить нельзя"
        } else {
            result = (a.trim().toInt() / b.trim().toInt()).toString()
        }
        return result
    }
    fun isNumeric(str:String)=str.all { it in '0'..'9' }
}