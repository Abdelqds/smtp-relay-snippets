MailMessage message = new MailMessage();
message.From = new MailAddress("your_email@example.com");

message.To.Add(new MailAddress("recipient1@example.com"));
message.To.Add(new MailAddress("recipient2@example.com"));
message.To.Add(new MailAddress("recipient3@example.com"));

message.Subject = "Subject goes here";
message.Body = "The message goes here";

SmtpClient client = new SmtpClient();
client.Send(message);
