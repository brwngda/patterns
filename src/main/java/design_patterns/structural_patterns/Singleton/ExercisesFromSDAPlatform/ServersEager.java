package design_patterns.structural_patterns.Singleton.ExercisesFromSDAPlatform;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project patterns
 * @created 8/10/2023
 */
public class ServersEager {

    private static final ServersEager INSTANCE = new ServersEager();

    public ServersEager getInstance() {
        return INSTANCE;
    }

    private final List<String> serverList;

    private ServersEager() {
        serverList = new ArrayList<>();
    }

    public boolean addServer(final String server) {
        if ((server.startsWith("http") || server.startsWith("https")) && !serverList.contains(server)) {
            return serverList.add(server);
        }
        return false;
    }

    public List<String> getHttpServers() {
        return serverList.stream()
                .filter(server -> server.startsWith("http"))
                .collect(Collectors.toUnmodifiableList());
    }

    private List<String> getServersStartingWith(final String prefix) {
        return serverList.stream()
                .filter(server -> server.startsWith(prefix))
                .collect(Collectors.toUnmodifiableList());
    }

    public List<String> getHttpsServers() {
        return serverList.stream()
                .filter(server -> server.startsWith("https"))
                .collect(Collectors.toUnmodifiableList());
    }
}