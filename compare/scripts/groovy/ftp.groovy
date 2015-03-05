@Grab('org.slf4j:slf4j-log4j12:1.7.7')
@Grab('org.apache.ftpserver:ftpserver-core:1.0.6')
import org.apache.ftpserver.FtpServerFactory
import org.apache.ftpserver.FtpServer
import org.apache.ftpserver.listener.ListenerFactory
import org.apache.ftpserver.ConnectionConfigFactory
import org.apache.ftpserver.usermanager.UserManagerFactory
import org.apache.ftpserver.usermanager.PropertiesUserManagerFactory
import org.apache.ftpserver.usermanager.impl.BaseUser
import org.apache.ftpserver.usermanager.impl.WritePermission
import org.apache.ftpserver.ftplet.Authority
import org.apache.ftpserver.usermanager.ClearTextPasswordEncryptor

serverFactory = new FtpServerFactory()
ConnectionConfigFactory connectionConfigFactory = new ConnectionConfigFactory()
connectionConfigFactory.setAnonymousLoginEnabled(true)

UserManagerFactory userFactory = new PropertiesUserManagerFactory()
userFactory.passwordEncryptor = new ClearTextPasswordEncryptor()

um = userFactory.createUserManager()
user = new BaseUser()
user.authorities = [new WritePermission()]
user.name='anonymous'
user.password=''
user.enabled=true
user.homeDirectory='/home/joaolourenco/ftp'
um.save(user)

ListenerFactory factory = new ListenerFactory()
factory.setPort(2221)
serverFactory.addListener("default", factory.createListener())
serverFactory.setConnectionConfig(connectionConfigFactory.createConnectionConfig())
serverFactory.setUserManager(um)

// start the server
server = serverFactory.createServer();
server.start()