package com.gourianova.apptrainer.controller.command;

import com.gourianova.apptrainer.controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
	private Map<com.gourianova.apptrainer.controller.command.CommandName, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put(com.gourianova.apptrainer.controller.command.CommandName.LOGINATION, new Logination());
		commands.put(com.gourianova.apptrainer.controller.command.CommandName.REGISTRATION, new GoToRegistrationPage());
		commands.put(com.gourianova.apptrainer.controller.command.CommandName.SAVENEWUSER, new SaveNewUser());
		commands.put(com.gourianova.apptrainer.controller.command.CommandName.GOTOINDEXPAGE, new GoToIndexPage());
		commands.put(com.gourianova.apptrainer.controller.command.CommandName.GOTOMAINPAGE, new GoToMainPage());
		commands.put(com.gourianova.apptrainer.controller.command.CommandName.LOGOUT, new Logout());
	}
	
	
	public Command takeCommand(String name) {
		com.gourianova.apptrainer.controller.command.CommandName commandName;
		
		commandName = com.gourianova.apptrainer.controller.command.CommandName.valueOf(name.toUpperCase());
		
		return commands.get(commandName);
	}

}
