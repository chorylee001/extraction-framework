package org.dbpedia.extraction.server.resources

import javax.ws.rs.{Produces, GET, PathParam, Path}
import io.Source

/**
 * Created by IntelliJ IDEA.
 * User: Paul
 * Date: 14.07.11
 * Time: 18:15
 * To change this template use File | Settings | File Templates.
 */
@Path("/p")
class Percentage {
    @GET
    @Produces(Array("application/xhtml+xml"))
    def get =
    {
        <html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
                <body>
                    {   Source.fromFile("src/main/resources/percentage.en").getLines().mkString }
                </body>
        </html>
    }
}