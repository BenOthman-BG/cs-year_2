<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>

    <xsl:template match="/">
        <html>
       <head>
            <title>Carnet de Contacts</title>
            <link rel="stylesheet" type="text/css" href="style.css" />
        </head>
        <body>
            <h2>Mes Contacts</h2>
            <table>
                <tr>
                    <th>Nom</th>
                    <th>Prénom</th>
                    <th>Téléphone</th>
                    <th>Email</th>
                    <th>Adresse</th>
                </tr>
                <xsl:for-each select="carnet/contact">
                    <tr>
                        <td><xsl:value-of select="nom"/></td>
                        <td><xsl:value-of select="prenom"/></td>
                        <td><xsl:value-of select="telephone"/></td>
                        <td><xsl:value-of select="email"/></td>
                        <td>
                            <xsl:value-of select="adresse/rue"/>, 
                            <xsl:value-of select="adresse/code_postal"/> 
                            <xsl:value-of select="adresse/ville"/>, 
                            <xsl:value-of select="adresse/pays"/>
                        </td>
                    </tr>
                </xsl:for-each>
            </table>
        </body>
        </html>
    </xsl:template>
</xsl:stylesheet>