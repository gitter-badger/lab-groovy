package lab

//import groovy.transform.CompileStatic

/**
 * GROOVY FEATURE Groovy features like optional typing and operator overloading <br/>
 * give developers greater flexibility in far less code.
 */
//@CompileStatic
class Dynamic {

    static void main(String [] args){

        def things = ['Ola']
        things << 73
        things << 56.0

        assert things == ['Ola', 73, 56.0]
        assert things*.class == [String, Integer, BigDecimal]

//        println things
//        println things*.class

    }

}
