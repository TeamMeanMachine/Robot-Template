package org.team2471.workshop

import org.team2471.frc.lib.framework.RobotProgram
import org.team2471.frc.lib.framework.initializeWpilib
import org.team2471.frc.lib.framework.runRobotProgram

object Robot : RobotProgram {
    override suspend fun autonomous() {
        TODO("not implemented")
    }

    override suspend fun teleop() {
        TODO("not implemented")
    }

    override suspend fun disable() {
        TODO("not implemented")
    }

    override suspend fun test() {
        TODO("not implemented")
    }

}

fun main(args: Array<String>) {
    initializeWpilib()

    runRobotProgram(Robot)
}