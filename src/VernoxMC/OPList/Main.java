package VernoxMC.OPList;

import java.io.File;


import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

// Some Nukkit imports that we will use
import java.io.FileNotFoundException;  
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import java.util.Scanner;
public class Main extends PluginBase
{

  //Create config variable for later use



  //onEnable method

 

  public void onEnable()
  {

    this.getLogger().info(TextFormat.GREEN + "I'm enabled!");

  }

  //onCommand method


  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {

    switch(cmd.getName())
    {

      case "oplist":


     

      try {
        File myObj = new File("ops.txt");
        sender.sendMessage(TextFormat.AQUA + "Current Operators");
        sender.sendMessage(TextFormat.YELLOW + "-----------------------");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          sender.sendMessage(TextFormat.GREEN + data);
        }
        myReader.close();
      } catch (FileNotFoundException e) {
        sender.sendMessage(TextFormat.RED + " File not found!");
        e.printStackTrace();
      }
      break;
    }

    return true;

  }

}