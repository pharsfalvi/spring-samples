package com.gembaboo.training.spring.shell;


import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import javax.validation.Valid;

@ShellComponent
public class Echo {


    @ShellMethod(value = "write arguments to the standard output")
    public String echo(@ShellOption(help="Argument") @Valid String arg){
        return arg;
    }
}
