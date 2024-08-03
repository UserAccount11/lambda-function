package com.tecylab.function.app;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.tecylab.function.app.models.Input;
import com.tecylab.function.app.models.Output;

public class Main implements RequestHandler<Input, Output> {

  @Override
  public Output handleRequest(Input input, Context context) {
    String greeting = String.format(
        "Hola %s %s esta es la respuesta de la función lambda %s y este fue el curso de Java!!!",
        input.getFirstname(), input.getLastname(), context.getFunctionName());
    // LOGICA ADCIONAL
    return Output.builder()
        .greeting(greeting)
        .build();
  }

}
