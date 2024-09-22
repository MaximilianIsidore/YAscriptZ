package com.interpreter.yaz;

import java.util.List;
interface YazCallable {
    int arity();

    Object call(Interpreter interpreter, List<Object> arguments);

}
