# StudentAssistanceHelperAPI

**Endpoint:**

> base_url/api/mail

**Request Body:**

        {
            "name":"Student_Name",
            "usn": "Student_USN",
            "url":"System_url",
            "to" : ["email_id_1","email_id_2"],
            "from" : "from_mail",
            "type":1,
            "subject" : "Leave Note Upload or SAP Issue Ticket Raised"
        }

> Note: type 1 for Leave note template, 2 for SAP issue template

**Template example:**

<img src="https://user-images.githubusercontent.com/90695071/219760518-71d64170-147e-43ab-9ed3-ea6a2aad8d26.jpg" data-canonical-src="https://user-images.githubusercontent.com/90695071/219760518-71d64170-147e-43ab-9ed3-ea6a2aad8d26.jpg" width="300" height="800" />
