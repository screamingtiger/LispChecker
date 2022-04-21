package Lisp

import spock.lang.Specification

class LispCheckerSpec extends Specification {

    def "Test Validate"() {
        setup:
        String inputOk = "((()))(adsfasffa\\(sfasdf))";
        String inputNotOK = "))((";
        String inputNotOK2 = "(()))(";
        String inputNull = null;
        String inputEmpty = "";

        when:
        boolean  inputOkResult = LispChecker.validate(inputOk);
        boolean  inputNotOKResult = LispChecker.validate(inputNotOK);
        boolean  inputNotOK2Result = LispChecker.validate(inputNotOK2);
        boolean  inputNullResult = LispChecker.validate(inputNull);
        boolean  inputEmptyResult = LispChecker.validate(inputEmpty);

        then:
        inputOkResult;
        !inputNotOKResult;
        !inputNotOK2Result;
        inputNullResult;
        inputEmptyResult;


    }
}
