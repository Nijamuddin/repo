package com.cisco.cmad.blogs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cisco.cmad.blogs.api.Blog;
import com.cisco.cmad.blogs.api.BlogException;
import com.cisco.cmad.blogs.api.DataNotFoundException;
import com.cisco.cmad.blogs.api.DuplicateDataException;
import com.cisco.cmad.blogs.api.InvalidDataException;

@Path("/blogs")
public class BlogsController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		try {
			// TODO implementation
			return Response.ok().build();
		} catch (DataNotFoundException dnfe) {
			return Response.status(Response.Status.NO_CONTENT).build();
		} catch (BlogException be) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Blog blog) {
		try {
			// TODO implementation
			return Response.status(Response.Status.CREATED).build();
		} catch (InvalidDataException ide) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (DuplicateDataException dde) {
			return Response.status(Response.Status.CONFLICT).build();
		} catch (BlogException be) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	// INFO should have been PATCH - but JERSY does not support PATCH and hence
	// using POST
	@POST
	@Path("/{blogid}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("blogid") int blogid) {
		try {
			// TODO implementation
			return Response.ok().build();
		} catch (InvalidDataException ide) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (BlogException be) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GET
	@Path("/{blogid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("blogid") int blogid) {
		try {
			// TODO implementation
			return Response.ok().build();
		} catch (DataNotFoundException dnfe) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (BlogException be) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DELETE
	@Path("/{blogid}")
	public Response delete(@PathParam("blogid") int blogid) {
		try {
			// TODO implementation
			return Response.ok().build();
		} catch (DataNotFoundException dnfe) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (BlogException be) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PUT
	@Path("/{blogid}/upvote")
	public Response doUpvote(@PathParam("blogid") int blogid) {
		try {
			// TODO implementation
			return Response.ok().build();
		} catch (DataNotFoundException dnfe) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (InvalidDataException ide) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (BlogException be) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DELETE
	@Path("/{blogid}/upvote")
	public Response undoUpvote(@PathParam("blogid") int blogid) {
		try {
			// TODO implementation
			return Response.ok().build();
		} catch (DataNotFoundException dnfe) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (InvalidDataException ide) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (BlogException be) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PUT
	@Path("/{blogid}/downvote")
	public Response doDownvote(@PathParam("blogid") int blogid) {
		try {
			// TODO implementation
			return Response.ok().build();
		} catch (DataNotFoundException dnfe) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (InvalidDataException ide) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (BlogException be) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DELETE
	@Path("/{blogid}/downvote")
	public Response undoDownvote(@PathParam("blogid") int blogid) {
		try {
			// TODO implementation
			return Response.ok().build();
		} catch (DataNotFoundException dnfe) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (InvalidDataException ide) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (BlogException be) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GET
	@Path("/{blogid}/upvote")
	public Response upvote(@PathParam("blogid") int blogid) {
		try {
			// TODO implementation
			return Response.ok().build();
		} catch (DataNotFoundException dnfe) {
			// TODO: how to differentiate between no upvotes and no blog id
			// (check above)
			return Response.status(Response.Status.NO_CONTENT).build();
		} catch (InvalidDataException ide) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (BlogException be) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GET
	@Path("/{blogid}/downvote")
	public Response downvote(@PathParam("blogid") int blogid) {
		try {
			// TODO implementation
			return Response.ok().build();
		} catch (DataNotFoundException dnfe) {
			return Response.status(Response.Status.NO_CONTENT).build();
		} catch (InvalidDataException ide) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (BlogException be) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
}
