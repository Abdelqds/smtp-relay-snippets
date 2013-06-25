import smtplib

#your critsend's credentials
critsend_user = 'YOUR CRITSEND USERNAME'
critsend_password = 'YOUR CRITSEND PASSWORD'

sender = "YOUR NAME "
recipients = ['RECIPIENT EMAIL']
subject = "My subject"
content = """My email message"""

message = ("From: %s\r\nTo: %s\r\nSubject: %s\r\n%s" %
           (sender, ", ".join(recipients), subject, content))

try:
    server = smtplib.SMTP("smtp.critsend.com", 587)
    server.ehlo()
    server.starttls()
    server.ehlo
    server.login(critsend_user, critsend_password)
    server.sendmail(sender, recipients, message)
    print "Successfully sent email"
except SMTPException:
    print "Error: unable to send email"