package in.sajid.authify.service;

import in.sajid.authify.io.ProfileRequest;
import in.sajid.authify.io.ProfileResponse;

public interface ProfileService {

    ProfileResponse createProfile(ProfileRequest request);

}
