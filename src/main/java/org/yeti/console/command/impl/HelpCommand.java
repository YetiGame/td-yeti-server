/*
 * Copyright (c) 2013
 * Kozlov Nikita
 */
package org.yeti.console.command.impl;

import org.yeti.console.command.AbstractCommand;
import org.yeti.console.command.CommandNames;
import org.yeti.console.command.RunCommand;

/**
 * Выводит список доступных команд и их описание.
 *
 * @author Kozlov Nikita
 * @see RunCommand
 * @see AbstractCommand
 */
public class HelpCommand extends AbstractCommand implements RunCommand {

    public HelpCommand() {
        this.setCommandName(CommandNames.HELP.toString());
    }

    /**
     * Метод, который отвечает за запуск команды.
     */
    @Override
    public void apply() {
        StringBuilder helpMessage = new StringBuilder();
        helpMessage.append("###### == Basic console commands\n")
                .append("##\n")
                .append("## start - starts the server\n")
                .append("## stop - stops the server\n")
                .append("## restart - restarts the server\n")
                .append("## reset - resets the sequence to 1 (server should be stopped)\n")
                .append("## welcome - prints a welcome message (which you are reading now)\n")
                .append("## help - prints a list of available commands\n")
                .append("## quit - leaves from the application\n")
                .append("##\n")
                .append("###### == Basic console commands");
        System.out.println(helpMessage);
    }
}
