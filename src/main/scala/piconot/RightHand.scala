package piconot

import java.io.File
import scalafx.application.JFXApp

import picolib.maze.Maze
import picolib.semantics._
import piconot.precious.lotrSemantics._
import piconot.precious._

object RightHand extends JFXApp {  
  
  val bot  = PicoPrecious("maze.txt", 
      // Facing North
      If you hold weapon 1
      and Shire is empty
      and LonelyMountain has Orcs
      and UndyingLands has anything
      and Mordor has anything
      then go towards Shire and ready weapon 1,
      
      If you hold weapon 1
      and Shire has anything
      and LonelyMountain is empty
      and UndyingLands has anything
      and Mordor has anything
      then go towards LonelyMountain and ready weapon 2,
      
      If you hold weapon 1
      and Shire has Orcs
      and LonelyMountain has Orcs
      and UndyingLands has anything
      and Mordor has anything
      then stay and ready weapon 3,
      
      // Facing East
      If you hold weapon 2
      and Shire has anything
      and LonelyMountain is empty
      and UndyingLands has anything
      and Mordor has Orcs
      then go towards LonelyMountain and ready weapon 2,
  
      If you hold weapon 2
      and Shire has anything
      and LonelyMountain has Orcs
      and UndyingLands has anything
      and Mordor has Orcs
      then stay and ready weapon 1,
  
      If you hold weapon 2
      and Shire has anything
      and LonelyMountain has anything
      and UndyingLands has anything
      and Mordor is empty
      then go towards Mordor and ready weapon 4,
      
      // Facing West
      If you hold weapon 3
      and Shire has Orcs
      and LonelyMountain has anything
      and UndyingLands is empty
      and Mordor has anything
      then go towards UndyingLands and ready weapon 3,
  
      If you hold weapon 3
      and Shire is empty
      and LonelyMountain has anything
      and UndyingLands has anything
      and Mordor has anything
      then go towards Shire and ready weapon 1,
  
      If you hold weapon 3
      and Shire has Orcs
      and LonelyMountain has anything
      and UndyingLands has Orcs
      and Mordor has anything
      then stay and ready weapon 4,
      
      // Facing South
      If you hold weapon 4
      and Shire has anything
      and LonelyMountain has anything
      and UndyingLands has Orcs
      and Mordor is empty
      then go towards Mordor and ready weapon 4,
  
      If you hold weapon 4
      and Shire has anything
      and LonelyMountain has anything
      and UndyingLands is empty
      and Mordor has anything
      then go towards UndyingLands and ready weapon 3,
  
      If you hold weapon 4
      and Shire has anything
      and LonelyMountain has anything
      and UndyingLands has Orcs
      and Mordor has Orcs
      then stay and ready weapon 2
  )
  
  bot.run()
  
  stage = bot.mainStage
}
