package com.github.jiangguilong2000.gamiootool.services

import com.intellij.openapi.project.Project
import com.github.jiangguilong2000.gamiootool.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
