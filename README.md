# StudentAssistanceHelperAPI

Endpoint:

> https://studentassistancehelperapi-production.up.railway.app/api/mail

Request Body:

> 

        {
            "name":"Student_Name",
            "usn": "Student_USN",
            "url":"System_url",
            "to" : ["rakshithdhegde.is20@rvce.edu.in","mssandeepk.is20@rvce.edu.in"],
            "from" : "from_mail",
            "type":1,
            "subject" : "Leave Note Upload or SAP Issue Ticket Raised"
        }

> Note: type 1 imples Leave note, 2 implies SAP issue
