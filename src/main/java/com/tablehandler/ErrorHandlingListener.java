package com.tablehandler;

import org.antlr.v4.runtime.*;
import java.util.List;
import java.util.Collections;

/**
 * Error handling ANTLR listener
 *
 * After parser object creation add the following instructions:
 * 
 * parser.removeErrorListeners();
 * parser.addErrorListener(new ErrorHandlingListener());
 *
 * 
 */
public class ErrorHandlingListener extends BaseErrorListener {
   @Override public void syntaxError(Recognizer<?, ?> recognizer,
         Object offendingSymbol,
         int line, int charPositionInLine,
         String msg,
         RecognitionException e)
   {
      ErrorHandling.printError(line, msg);
   }
}

