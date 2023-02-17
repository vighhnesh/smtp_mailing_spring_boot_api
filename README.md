# StudentAssistanceHelperAPI

Endpoint:

> https://studentassistancehelperapi-production.up.railway.app/api/mail

Request Body:

> 

        {
            "name":"Student_Name",
            "usn": "Student_USN",
            "url":"System_url",
            "to" : ["email_id_1","email_id_2"],
            "from" : "from_mail",
            "type":1,
            "subject" : "Leave Note Upload or SAP Issue Ticket Raised"
        }

> Note: type 1 imples Leave note, 2 implies SAP issue
