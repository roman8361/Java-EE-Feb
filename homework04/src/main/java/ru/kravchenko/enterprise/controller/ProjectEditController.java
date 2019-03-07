package ru.kravchenko.enterprise.controller;

import com.ocpsoft.pretty.faces.annotation.URLMapping;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.kravchenko.enterprise.api.ProjectRepositoty;
import ru.kravchenko.enterprise.entity.Project;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 * @author Roman Kravchenko
 */

@ViewScoped
@ManagedBean
@URLMapping(
        id = "project-edit",
        pattern = "/project-edit",
        viewId = "/WEB-INF/faces/project-edit.xhtml")
public class ProjectEditController {

    @Inject
    private ProjectRepositoty projectRepositoty;

    @Nullable
    private String id;

    @NotNull
    private Project project = new Project();

    public void init() {
        @Nullable final Project project = projectRepositoty.findById(id);
        if (project != null) this.project = project;
    }

    public String save() {
        projectRepositoty.merge(project);
        return "project-list";
    }

    @NotNull
    public Project getProject() { return project; }

    public void setProject(@NotNull final Project project) { this.project = project; }

    @Nullable
    public String getId() { return id; }

    public void setId(@Nullable final String id) { this.id = id; }

}
