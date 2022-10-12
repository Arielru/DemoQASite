package Utilities;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
//import org.eclipse.jetty.websocket.api.Session;

import static Utilities.commonOps.getXMLData;

public class manageLinuxServer extends Base {

    public static void initConnection(String linuxUser, String linuxPassword, String command) {
        String host = getXMLData("LinuxServer");
        String user = getXMLData("LinuxUser");
        String password = getXMLData("LinuxPassword");
        String command1 = "ls -ltr";

        {
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            Session session = null;
            try {
                session = linux.getSession(user, host, 22);
            } catch (JSchException e) {
                e.printStackTrace();
            }
            session.setPassword(password);
            session.setConfig(config);
            try {
                session.connect();
            } catch (JSchException e) {
                e.printStackTrace();
            }
            System.out.println("Connected");
            try {
                Channel channel = session.openChannel("exec");
            } catch (JSchException e) {
                e.printStackTrace();
            }
        }
    }
}