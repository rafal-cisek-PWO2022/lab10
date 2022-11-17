package pwo.lab10.chain;

public class TxtProcRemoveNumbers extends TxtProc {
    public static String ACTION = "REMOVENUMBERS";

    @Override
    public String processRequest(Request request) {
        if (request.action.toUpperCase().equals(ACTION)) {
            return request.text.replaceAll("\\d","");
        } else
            return next(request);
    }
}
