package com.github.zcloveyj.plugintemplate.services

import com.intellij.openapi.project.Project
import com.github.zcloveyj.plugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
