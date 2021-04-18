package org.ul.dpproj.entity.command;

import java.util.ArrayList;
import java.util.List;

public class Waitor {

    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command){
        commands.add(command);
    }

    public void orderUp(){
        for(int i = 0;i < commands.size();i++){
            Command command = commands.get(i);
            if(command!=null){
                command.execute();
            }
        }
    }

}
