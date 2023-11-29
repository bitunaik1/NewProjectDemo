package PracticeQR;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.mail.Store;

import com.testing.framework.EmailUtils;

public class OTPHandleFromE_Mail {
public static void main(String[] args) throws Throwable {
	
	EmailUtils emailUtils= new EmailUtils();

	Properties prop= new Properties();
	prop.load(new FileInputStream("./src/test/resources/New.properties"));

	Store connection = emailUtils.connectToGmail(prop);
	List<String> emailtext = emailUtils.getUnreadMessageByFromEmail(connection, "Primary", "account-security-noreplay@accountprotection.microsoft.com", "Microsoft account password reset");
	if(emailtext.size()<1) {
		System.out.println();
	}else {
		String text="[^\\d]+";
		String[] value = emailtext.get(0).split(text);
		System.out.println(value[1]);
	}
	
//	Properties props = new Properties();
//	props.setProperty("mail.store.protocol", "imaps");
//
//	try {
//		Session session = Session.getInstance(props, null);
//
//	Store store = session.getStore();
//
//	store.connect(Constants.CONNECTION_EMAIL, ExcelUtils.getCellData(row, 0, Constants.SIGN_UP_SHEET),
//
//	ExcelUtils.getCellData(row, 1, Constants.SIGN_UP_SHEET));
//
//	Folder inbox = store.getFolder("INBOX");
//
//	sleep(t);
//
//	inbox.open(Folder.READ_ONLY);
//
//	Message msg = inbox.getMessage(inbox.getMessageCount());
//
//	Address[] in = msg.getFrom();
//
//	for (Address address : in) {
//
//	System.out.println("FROM:" + address.toString());
//
//	}
//
//	
//
//	logger.info("SENT DATE:" + msg.getSentDate());
//
//	logger.info("SUBJECT:" + msg.getSubject());
//
//	logger.info("CONTENT:" + msg.getContent());
//
//	HTMLEditorKit kit = new HTMLEditorKit();
//
//	HTMLDocument doc = (HTMLDocument) kit.createDefaultDocument();
//
//	Reader reader = new StringReader(msg.getContent().toString());
//
//	kit.read(reader, doc, 0);
//
//	for (HTMLDocument.Iterator iterator = doc.getIterator(HTML.Tag.SPAN); iterator.isValid(); iterator.next()) {
//
//	AttributeSet set = iterator.getAttributes();
//
//	if (set != null) {
//
//	if (set.toString().contains("#7eafac")) {
//
//	int startOffset = iterator.getStartOffset();
//
//	int endOffSet = iterator.getEndOffset();
//
//	text = doc.getText(startOffset, (endOffSet - startOffset));
//
//	logger.info(text);
//
//	}
//
//	}
//
//	}
//
//	} catch (Exception e) {
//
//	e.getMessage();
//
//	}

	}
}

