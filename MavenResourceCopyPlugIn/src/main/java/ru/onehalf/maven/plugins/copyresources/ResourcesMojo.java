package ru.onehalf.maven.plugins.copyresources;

import org.apache.commons.io.FileUtils;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import java.io.File;
import java.io.IOException;

/**
 * The maven plugin for copying resources from the specified directories to target
 * <p/>
 * Created: 18.04.12 19:38
 * <p/>
 * @goal copy
 * @phase process-resources
 * @author OneHalf
 */
public class ResourcesMojo extends AbstractMojo {

    /**
     * The directories, which content must be copied
     * @parameter
     * @required
     */
    private File[] sources;

    /**
     * Target directory for collected data
     * @parameter default-value="${project.build.directory}/webapp"
     */
    private File destination;

    /**
     * @throws MojoExecutionException
     * @throws MojoFailureException
     */
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        for (File source : sources) {
            try {
                getLog().info(String.format("copy directory %s to %s", source, destination));
                FileUtils.copyDirectory(source, destination, false);
            } catch (IOException e) {
                throw new MojoFailureException(e, "can not copy files", e.getMessage());
            }
        }
    }
}
