package com.tabula.announcement.model;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-07-27T17:39:21+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.4 (JetBrains s.r.o)"
)
public class AnnouncementMapperImpl implements AnnouncementMapper {

    @Override
    public AnnouncementEntity mapAnnouncementDtoToEntity(AnnouncementDto dto) {
        if ( dto == null ) {
            return null;
        }

        AnnouncementEntity announcementEntity = new AnnouncementEntity();

        announcementEntity.setId( dto.getId() );
        announcementEntity.setCreatedOn( dto.getCreatedOn() );
        announcementEntity.setUpdatedOn( dto.getUpdatedOn() );
        announcementEntity.setTitle( dto.getTitle() );
        announcementEntity.setDescription( dto.getDescription() );

        return announcementEntity;
    }

    @Override
    public AnnouncementDto mapAnnouncementEntityToDto(AnnouncementEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AnnouncementDto announcementDto = new AnnouncementDto();

        announcementDto.setId( entity.getId() );
        announcementDto.setCreatedOn( entity.getCreatedOn() );
        announcementDto.setUpdatedOn( entity.getUpdatedOn() );
        announcementDto.setTitle( entity.getTitle() );
        announcementDto.setDescription( entity.getDescription() );

        return announcementDto;
    }
}
