#Autonomous tasks

This is a list of tasks that the robot will need to complete in autonomous mode. Feel free to edit as needed.


* Start at predetermined place
* move towards tote
* align with tote (adjust with kinect)
* Grab tote
* use turret to stack tote 
* repeat from 2 through 4 until last tote is done
* Move to auto zone
* drop stack
* end autonomous

##Translated to commands
* nothing
* driveForward()
* ???
* grabber.close()
* some automated turret movement command, elevator.lift(), grabber.open(), move turret back, elevator.lower()
* strafeLeft()
* repeat from step 2
* driveForward() until the robot is in the auto zone
* option 1: push crates off
* option 2: elevator.lift(), move turret back to stack, grabber.open(), elevator.lower(), grabber.close(), move turret back to front, grabber.open()
