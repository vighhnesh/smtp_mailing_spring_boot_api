# Mailing API

### An SMTP mailing api supporting Multi Threading and Freemarker(.ftl) Templates.

**Endpoint:**

> base_url/api/mail

**Request Body:**

        {
            "name":"Student_Name",
            "usn": "Student_USN",
            "url":"System_url",
            "to" : ["email_id_1","email_id_2","...","..."],
            "from" : "from_mail",
            "type":1,
            "subject" : "Leave Note Upload or SAP Issue Ticket Raised"
            "content":"any_content"
        }

> Note: type 1 for Leave note template, 2 for SAP issue template

**Current Email Limits:**

> Up to 150 messages per hour.

> Up to 99 recipients per message.

**Template example:**

<img src="https://user-images.githubusercontent.com/90695071/219760518-71d64170-147e-43ab-9ed3-ea6a2aad8d26.jpg" data-canonical-src="https://user-images.githubusercontent.com/90695071/219760518-71d64170-147e-43ab-9ed3-ea6a2aad8d26.jpg" width="300" height="800" />

**Modifications:**

Set environment variables:

*smtp_mailing_spring_boot_api/src/main/resources/application.properties*

> spring.mail.username=${google_user_name}

> spring.mail.password=${google_password}

Customize templates:

*smtp_mailing_spring_boot_api/src/main/resources/templates/*



