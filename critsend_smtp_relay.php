<?php
$from, "To" => $to, "Subject" => $subject);
$smtp = Mail::factory("smtp",
array(  "host" => $host,
       "auth" => true,
       "username" => $username,
       "password" => $password));

$mail = $smtp->send($to, $headers, $body);

if(PEAR::isError($mail)){
    echo($mail->getMessage());
}else{
    echo("Message successfully sent!");
}
?>
