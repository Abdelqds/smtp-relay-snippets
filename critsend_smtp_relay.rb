ActionMailer::Base.smtp_settings = {
       :address => "smtp.critsend.com",
       :port => 587,
       :authentication => :plain,
       :user_name => "YOUR_CRITSEND_USERNAME",
       :password => "YOUR_CRITSEND_PASSWORD",
       :enable_starttls_auto => false
}

ActionMailer::Base.delivery_method = :smtp
