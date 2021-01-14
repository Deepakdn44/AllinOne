package Utilities;

import java.rmi.AccessException;

import javax.management.monitor.MonitorSettingException;

public class TestMail {

	public static void main(String[] args) throws MonitorSettingException, AccessException {
		MonitoringMail mail = new MonitoringMail();
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody);
	}

}
